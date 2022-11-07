-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');
insert into Category (description, initials, version) values
                        ('Electronics', 'ELTC', 0),
                        ('Smartphones', 'SMTP', 0),
                        ('Domestic', 'DMTC', 0);

insert into Product (name, category_id, version) values
                        ('Samsung Galaxy S20 FE', 1, 0),
                        ('Samsung Galaxy S22 Ultra', 1, 0),
                        ('Television', 2, 0);
