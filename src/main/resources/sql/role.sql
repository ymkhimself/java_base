-- 角色表
-- auto-generated definition
create table role
(
    role_id             bigint unsigned auto_increment comment '主键'
        primary key,
    role_name           varchar(50)                null comment '角色名称',
    remark              varchar(200)               null comment '备注',
    create_time         datetime                   null comment '创建时间',
    modified_time       datetime                   null comment '修改时间',
    create_account_id   bigint unsigned            null comment '创建人',
    modified_account_id bigint unsigned            null comment '修改人',
    deleted             tinyint unsigned default 0 null comment '逻辑删除标识(0、否 1、是)'
)
    comment '角色表';