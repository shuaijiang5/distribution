package com.shuaijiang.market.util;

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
        public final static String PATH_IMAGES = "D:\\Hasee\\IdeaProjects1808\\tiny\\src\\main\\webapp\\images\\";
    }
    public static String photos(MultipartFile photo){
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        try {
            photo.transferTo(new File(PATH_IMAGES + s));
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
