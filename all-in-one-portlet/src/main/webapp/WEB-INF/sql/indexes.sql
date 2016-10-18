create index IX_D1DF7309 on MTT_Author (status);
create index IX_DE0A6531 on MTT_Author (uuid_);
create index IX_446F2657 on MTT_Author (uuid_, companyId);
create unique index IX_AB6B5699 on MTT_Author (uuid_, groupId);

create index IX_2DFB6B67 on MTT_Book (status);
create index IX_D07EE913 on MTT_Book (uuid_);
create index IX_B3EEC135 on MTT_Book (uuid_, companyId);
create unique index IX_793010F7 on MTT_Book (uuid_, groupId);

create index IX_994D90AB on MTT_author_book (authorId);
create index IX_CA086BC9 on MTT_author_book (bookId);

create index IX_275F552F on MTT_book_author (authorId);
create index IX_D409814D on MTT_book_author (bookId);