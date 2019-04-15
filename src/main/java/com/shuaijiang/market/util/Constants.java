package com.shuaijiang.market.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static com.shuaijiang.market.util.Constants.path.PATH_IMAGES;

/**
 * 常量
 */
public class Constants {
    /**
     * 分页相关常量
     */
    public final static class Page{
        /**
         * 页大小
         */
        public final static Integer PAGE_SIZE = 3;
    }
    
    public final static class path{
        public final static String PATH_IMAGES = "D:\\IT\\feiq\\Recv Files\\Soft1808\\nginx-1.10.3\\images\\images\\";
    }

    public static String photos(MultipartFile picture){
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        try {
            picture.transferTo(new File(PATH_IMAGES + s));
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
