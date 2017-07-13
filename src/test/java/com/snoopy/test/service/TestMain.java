package com.snoopy.test.service;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by V on 2017/7/6.
 */
public class TestMain {
    public static void main(String[] args) throws IOException {
//            Path path = Paths.get("C:/Users/V/Desktop/file-soonpy/");
//        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
//        for (Path pathObj:directoryStream){
//            BasicFileAttributes attrs = Files.readAttributes(pathObj, BasicFileAttributes.class);
//            System.out.println(attrs.size());
//
//        }
//
//            AclFileAttributeView fileAttributeView = Files.getFileAttributeView(path, AclFileAttributeView.class);
//        Set<AclEntryPermission> permissions = fileAttributeView.getAcl().get(0).permissions();

        Map map = new HashMap<>();
        map.put(null,"xxx");
        map.put(null,null);

        Map sss = new Hashtable<>();
//        sss.put(null,"xxx");
//        sss.put("xxx",null);
    }

}
