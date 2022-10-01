package com.xy.utils;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String suffix = "txt";
        // 根据后缀名获取对应的文件生成器
        FileGenerate fileGenerate = FileGenerateFactory.getFileGenerate(suffix);
        // 生成文件
        fileGenerate.generate(new ArrayList<>(), "");
    }
}

