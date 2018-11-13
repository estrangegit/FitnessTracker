insert into users (username, password, enabled) values ("bryan", "secret", true);

insert into authorities (username, authority) values ("bryan", "ROLE_USER");

insert into users (username, password, enabled) values ("chris", "secret", true);

insert into authorities (username, authority) values ("chris", "ROLE_ADMIN");

insert into authorities (username, authority) values ("chris", "ROLE_USER");