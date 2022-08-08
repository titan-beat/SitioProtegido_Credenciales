
create table users(email varchar, password varchar, role varchar);

insert into users(email, password, role) values('bobEsponja@mail.com','$2a$10$T4xQ89SRAZJbA5GrwtkwhuuY9dK4yCsEsu6FC5qyF.pjY2.WlC0gS','CLIENT');

insert into users(email, password, role) values ('patricioEstrella@mail.com','$2a$10$Ypnx5m1ocFKWpIHqhg013eb/pQvDTgFNMT1v3UEyKMmoCNe0ztn2S','ADMIN');

insert into users(email, password, role) values ('admin@mail.cl','$2a$12$Hzxm.r3aNLADxDvt4z/TQOhGepSgxFfjI01Ik/eC0TtEqv5LEerUa','ADMIN');

insert into users(email, password, role) values ('client@mail.cl','$2a$12$hIu6VWNYh19XYMZvfbVc7.f5A.AIodMlVRPuV6ITIEDiM7RUe1Mge','CLIENT');

--contraseña de admin@mail.cl es 123456 (rol: ADMIN)
--contraseña de client@mail.cl es 654321 (rol: CLIENT)

--contraseña de bobEsponja@mail.com es crab (rol: CLIENT)
--contraseña de patricioEstrella@mail.com es curry (rol: ADMIN)