package com.cn.fmstroe.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//lombok使用
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
    public int id;
    public String name;
    public String password;
}

