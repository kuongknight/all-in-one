create table MTT_Author (
	uuid_ VARCHAR(75) null,
	authorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	born DATE null,
	male BOOLEAN,
	status INTEGER
);

create table MTT_Book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	publishDate DATE null,
	status INTEGER,
	viewCount INTEGER
);

create table MTT_author_book (
	authorId LONG not null,
	bookId LONG not null,
	primary key (authorId, bookId)
);

create table MTT_book_author (
	authorId LONG not null,
	bookId LONG not null,
	primary key (authorId, bookId)
);