-- 账号表
-- auto-generated definition
create table account
(
    account_id          bigint unsigned auto_increment comment '主键'
        primary key,
    role_id             bigint unsigned            null comment '角色id',
    username            varchar(20)                null comment '用户名',
    password            varchar(32)                null comment '密码',
    real_name           varchar(50)                null comment '真实姓名',
    sex                 char                       null comment '性别',
    email               varchar(100)               null comment '邮箱',
    create_time         datetime                   null comment '创建时间',
    modified_time       datetime                   null comment '修改时间',
    create_account_id   bigint unsigned            null comment '创建人',
    modified_account_id bigint unsigned            null comment '修改人',
    deleted             tinyint unsigned default 0 null comment '逻辑删除标识(0、否 1、是)'
)
    comment '账号表'