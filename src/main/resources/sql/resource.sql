-- 资源表
-- auto-generated definition
create table resource
(
    resource_id   bigint unsigned not null comment '主键'
        primary key,
    parent_id     bigint unsigned null comment '父id',
    resource_name varchar(50)     null comment '资源名称',
    resource_type tinyint         null comment '资源类型(0、目录 1、菜单 2、按钮)',
    url           varchar(200)    null comment '请求地址',
    code          varchar(100)    null comment '权限标识码',
    sort          int unsigned    null comment '排序'
)
    comment '资源表'