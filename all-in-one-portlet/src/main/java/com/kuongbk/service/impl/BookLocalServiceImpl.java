package com.kuongbk.service.impl;

import com.kuongbk.model.Book;
import com.kuongbk.service.BookLocalServiceUtil;
import com.kuongbk.service.base.BookLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetLinkConstants;

import java.util.Date;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.kuongbk.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.kuongbk.service.base.BookLocalServiceBaseImpl
 * @see com.kuongbk.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.kuongbk.service.BookLocalServiceUtil} to access the book local
	 * service.
	 */
	public Book updateBook(long id, String name, String description, Date publishDate, ServiceContext serviceContext)
			throws SystemException, PortalException {
		Book book = null;
		if (id == 0) {
			book = BookLocalServiceUtil.createBook(counterLocalService.increment(Book.class.getName()));
			book.setCreateDate(new Date());
		} else {
			book = BookLocalServiceUtil.fetchBook(id);
			book.setModifiedDate(new Date());
		}
		long userId = serviceContext.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		String userName = PortalUtil.getUserName(userId, UserLocalServiceUtil.getUser(userId).getScreenName());
		book.setUserId(userId);
		book.setCompanyId(companyId);
		book.setName(name);
		book.setGroupId(groupId);
		book.setUserName(userName);
		book.setDescription(description);
		book.setPublishDate(publishDate);
		
		long classTypeId = 0;
		boolean visible = true;
		Date startDate = null;
		Date endDate = null;
		Date expirationDate = null;
		String mimeType = ContentTypes.TEXT_HTML;
		String title = name;
		String summary = null;
		String url = null;
		String layoutUuid = null;
		int height = 0;
		int width = 0;
		Integer priority = null;
		boolean sync = false;
		AssetEntry assetEntry = assetEntryLocalService.updateEntry(
		    userId, groupId, book.getCreateDate(),
		    book.getModifiedDate(), Book.class.getName(),
		    book.getBookId(), book.getUuid(), classTypeId,
		    serviceContext.getAssetCategoryIds(),
		    serviceContext.getAssetTagNames(), visible, startDate, endDate,
		    expirationDate, mimeType, title, description, summary, url,
		    layoutUuid, height, width, priority, sync);
		assetLinkLocalService.updateLinks(
			    userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
			    AssetLinkConstants.TYPE_RELATED);
		
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Book.class);
		indexer.reindex(book);
		return bookLocalService.updateBook(book);
	}
}
