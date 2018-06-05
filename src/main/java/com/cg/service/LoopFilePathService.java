package com.cg.service;

import com.cg.entity.FilePath;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LoopFilePathService {

//遍历桌面文件，并传入String类型的path,和FilePath类型的集合list;
    public void getListByPath(String path, List<FilePath> list){
//创造一个Filel类型的对象file;
        File file = new File(path);
//将file的全部属性赋给数组类型的files;
        File[] files = file.listFiles();
//遍历数组
        for(File f : files){
            //创造一个FilePath类型的对象fp
            FilePath fp = new FilePath();
            //将文件名称放入fp中
            fp.setName(f.getName());
            //将文件路径放入fp中;
            fp.setPath(f.getPath()+File.separator+f.getName());
            //判断文件是文件夹还是文件，并把它放入fp中;
            fp.setType(f.isDirectory()?"forder":"file");
            //将fp放入集合中;
            list.add(fp);
        }
    }
    //删除文件传入String类型的Path,并返回布尔类型的值;
    public boolean delete(String path){
        //创建一个File类型的对象，并将path赋给她
        File file = new File(path);
        //删除文件
file.delete();


return true;
    }
}
