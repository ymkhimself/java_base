-- 客户表
-- auto-generated definition
create table customer
(
    customer_id         bigint unsigned auto_increment comment '主键'
        primary key,
    real_name           varchar(50)                null comment '真实姓名',
    sex                 char                       null comment '性别',
    age                 tinyint unsigned           null comment '年龄',
    email               varchar(100)               null comment '邮箱',
    phone               varchar(11)                null comment '手机号码',
    address             varchar(200)               null comment '地址',
    create_time         datetime                   null comment '创建时间',
    modified_time       datetime                   null comment '修改时间',
    create_account_id   bigint unsigned            null comment '创建人',
    modified_account_id bigint unsigned            null comment '修改人',
    deleted             tinyint unsigned default 0 null comment '逻辑删除标识(0、否 1、是)'
)
    comment '客户表';