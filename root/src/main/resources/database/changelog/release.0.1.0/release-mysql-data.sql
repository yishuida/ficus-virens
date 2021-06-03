INSERT INTO blog_sys_user (id,username, password) values
    (1, 'admin', '123456'), (2, 'vista yih', '123456'), (3, 'daqiang', '123456'),
    (4, 'test', '123456');

INSERT INTO blog_sys_user_info (id, first_name, last_name) VALUES
    (2, 'Vista', 'Yih');

INSERT INTO blog_sys_role (id, role_name) VALUES
    (1, 'administrator'), (2, 'author'), (3, 'visitor'), (4, 'test');

INSERT INTO blog_sys_permission (id, permission) VALUES
    (1, 'role'), (2, 'post'), (3, 'comment'), (4, 'test');

INSERT INTO blog_sys_user_role (user_id, role_id) VALUES
    (1, 1), (1, 2),(1, 3), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3);

INSERT INTO blog_sys_role_permission (role_id, permission_id) VALUES
    (1, 1), (1, 2), (1, 3), (2, 2), (3 ,1), (3, 2), (3, 3);