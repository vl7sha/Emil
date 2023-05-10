create table if not exists books
(
    name        varchar     not null,
    count       int         not null,
    author      UUID        not null,
    date        date        not null,
    UNIQUE      (name),
    PRIMARY KEY (name)
    );
ALTER TABLE books ADD CONSTRAINT fk_users FOREIGN KEY (author) references users(id)
