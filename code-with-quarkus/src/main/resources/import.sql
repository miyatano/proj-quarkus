INSERT INTO fruit(id, name, price) VALUES (nextval('hibernate_sequence'), 'Cherry', 1000);
INSERT INTO fruit(id, name, price) VALUES (nextval('hibernate_sequence'), 'Apple', 300);
INSERT INTO fruit(id, name, price) VALUES (nextval('hibernate_sequence'), 'Banana', 150);

INSERT INTO expireitem(id, name, expireDate) VALUES (nextval('hibernate_sequence'), '缶詰', '2021/09/30');
INSERT INTO expireitem(id, name, expireDate) VALUES (nextval('hibernate_sequence'), 'レトルトカレー', '2022/01/22');
INSERT INTO expireitem(id, name, expireDate) VALUES (nextval('hibernate_sequence'), 'はちみつ', '2022/12/01');