package com.example.day05_lxc.JavaBean;

import java.util.List;

public class ItemList {

    @Override
    public String toString() {
        return "ItemList{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>上一道题目，关于 BadTokenException，很多同学指出 Toast 可能会出现这个问题，我们需要修复一下。<\/p>\r\n<p>我们自己的代码，没问题，可以修复，假设这个 toast 在 SDK里面调用的，我们也没有源码，怎么处理呢？<\/p>\r\n<p>有什么思路吗？<\/p>","envelopePic":"","fresh":false,"id":9844,"link":"https://www.wanandroid.com/wenda/show/9844","niceDate":"2019-10-23","niceShareDate":"2019-10-20","origin":"","prefix":"","projectLink":"","publishTime":1571760643000,"selfVisible":0,"shareDate":1571586263000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 SDK 的问题 怪我咯？","type":0,"userId":2,"visible":1,"zan":8},{"apkLink":"","audit":1,"author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9939,"link":"https://mp.weixin.qq.com/s/TQ05xCcQjSp9-BFYoQWOqw","niceDate":"2019-10-23","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571760000000,"selfVisible":0,"shareDate":1572008735000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"线程的来龙去脉，你了解吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9924,"link":"https://mp.weixin.qq.com/s/6zLLtY6ooMbujpF3bJFPPw","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572007860000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"基于Jetpack的全系列加实战 app 教程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9928,"link":"https://mp.weixin.qq.com/s/ymuLKtyr_8GCRVsBTylL1Q","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572008040000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android 现在还能执行后台任务吗？试试 WorkManager 吧","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9934,"link":"https://mp.weixin.qq.com/s/07kgEcHXi4MKz2JoEFAg4g","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572008430000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Flutter动画：用Flutter来实现一个拍手动画","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"程序亦非猿","chapterId":428,"chapterName":"程序亦非猿","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9941,"link":"https://mp.weixin.qq.com/s/NwQZ-7NptHb848WYHPljNg","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572008865000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/428/1"}],"title":"成熟项目的Flutter快速引入以及Flutter、Native混合开发探究","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":471,"chapterName":"10.0（Q）","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9857,"link":"https://www.jianshu.com/p/10bdbf883c46?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571671921000,"selfVisible":0,"shareDate":1571665822000,"shareUser":"鸿洋","superChapterId":453,"superChapterName":"版本适配","tags":[],"title":"Android从5.0到9.0版本的主要变更","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9856,"link":"https://juejin.im/post/5dac6aa2518825630e5d17da","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571671919000,"selfVisible":0,"shareDate":1571665646000,"shareUser":"鸿洋","superChapterId":126,"superChapterName":"自定义控件","tags":[],"title":"总结UI原理和UI优化方式","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"jsyjst","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"随心音乐，是一款基于MVP+Retrofit+EventBus+Glide的应用，有兴趣的盆友欢迎Star,Fork!","envelopePic":"https://www.wanandroid.com/blogimgs/025c4573-38d9-4cdc-a591-685a73ac7163.png","fresh":false,"id":9867,"link":"https://www.wanandroid.com/blog/show/2698","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"https://github.com/jsyjst/YuanMusicPlay","publishTime":1571671914000,"selfVisible":0,"shareDate":1571671756000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"随心音乐，让心跟着跳动起来","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9820,"link":"https://www.wanandroid.com/blog/show/2690","niceDate":"2019-10-21","niceShareDate":"2019-10-19","origin":"","prefix":"","projectLink":"","publishTime":1571671906000,"selfVisible":0,"shareDate":1571449264000,"shareUser":"","superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"申请了一波免费票","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"AlanCheen","chapterId":367,"chapterName":"资源聚合类","collect":false,"courseId":13,"desc":"阿里内推指南","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":9866,"link":"https://www.wanandroid.com/blog/show/2697","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"https://github.com/AlanCheen/Alibaba-Nei-Tui-Guide","publishTime":1571671553000,"selfVisible":0,"shareDate":1571671553000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=367"}],"title":"《阿里内推指南》","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"ShowMeThe","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"利用wanandroid ApI实现，基于AAC的玩安卓客户端\r\n网络请求利用Retrofit2 + Coroutines，抛弃了RxJava的怀抱完成网络请求部分\r\n已完成\r\n#主页，公众号，知识体系，项目，收藏，登录注册等基本功能\r\n另外为了实现ROOM的应用，本地添加数据，完成基本的登录和数据展示功能\r\n#剩余功能尚未完善，开发中","envelopePic":"https://www.wanandroid.com/blogimgs/1534e4e3-456e-40dd-8f77-2328ce72a388.png","fresh":false,"id":9863,"link":"https://www.wanandroid.com/blog/show/2694","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"https://github.com/ShowMeThe/WanAndroid","publishTime":1571671303000,"selfVisible":0,"shareDate":1571671303000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于AAC架构玩安卓客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":454,"chapterName":"规范","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9862,"link":"https://w.url.cn/s/AWmdQg1","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571670981000,"selfVisible":0,"shareDate":1571669893000,"shareUser":"ZYLAB","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"五分钟搞定正则表达式，如果没搞定，再加两分钟","type":0,"userId":10577,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9859,"link":"https://juejin.im/post/5dad9f1a6fb9a04e343d672d","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571670946000,"selfVisible":0,"shareDate":1571667421000,"shareUser":"TeaOOf","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"简单大方的状态视图，快了解一下！","type":0,"userId":25956,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9923,"link":"https://mp.weixin.qq.com/s/N3vp91usxclib1NuGEuPgA","niceDate":"2019-10-21","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571587200000,"selfVisible":0,"shareDate":1572007835000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"面试官：今日头条启动很快，你觉得可能是做了哪些优化？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9930,"link":"https://mp.weixin.qq.com/s/9T8yTDaN8z1aeJNuS7pBJw","niceDate":"2019-10-21","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571587200000,"selfVisible":0,"shareDate":1572008132000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"代码写成这样，老夫无可奈何！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9933,"link":"https://mp.weixin.qq.com/s/0xek4nnc2zoKpslEyILQmw","niceDate":"2019-10-21","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571587200000,"selfVisible":0,"shareDate":1572008412000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"总是听到有人说AndroidX，到底什么是AndroidX？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9823,"link":"https://www.jianshu.com/p/db2b95b92bf0","niceDate":"2019-10-20","niceShareDate":"2019-10-19","origin":"","prefix":"","projectLink":"","publishTime":1571586437000,"selfVisible":0,"shareDate":1571453046000,"shareUser":"于慢慢家的吴蜀黍","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"《Flutter in action》开放下载！闲鱼Flutter企业级实践精选","type":0,"userId":1260,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>作为 Android 开发，这个异常一定都在自家崩溃平台上见过，那么<\/p>\r\n<ol>\r\n<li>有哪些场景下会出现这个异常呢？<\/li>\r\n<li>分别如何解决？<\/li>\r\n<li>有无一些开源方案参考？<\/li>\r\n<\/ol>\r\n<p>知道多少答多少哈，别冷场呀~<\/p>","envelopePic":"","fresh":false,"id":9702,"link":"https://www.wanandroid.com/wenda/show/9702","niceDate":"2019-10-20","niceShareDate":"2019-10-15","origin":"","prefix":"","projectLink":"","publishTime":1571586395000,"selfVisible":0,"shareDate":1571153150000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 BadTokenException 你知道多少？","type":0,"userId":2,"visible":1,"zan":24},{"apkLink":"","audit":1,"author":"xuexiangjys","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"一键集成推送（极光推送、友盟推送、信鸽推送、华为、小米推送等），提供有效的保活机制，支持推送的拓展，充分解耦推送和业务逻辑，解放你的双手！","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":9843,"link":"https://www.wanandroid.com/blog/show/2693","niceDate":"2019-10-20","niceShareDate":"2019-10-20","origin":"","prefix":"","projectLink":"https://github.com/xuexiangjys/XPush","publishTime":1571573517000,"selfVisible":0,"shareDate":1571573517000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"XPush 一个轻量级、可插拔的Android消息推送框架。","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":369,"size":20,"total":7374}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>上一道题目，关于 BadTokenException，很多同学指出 Toast 可能会出现这个问题，我们需要修复一下。<\/p>\r\n<p>我们自己的代码，没问题，可以修复，假设这个 toast 在 SDK里面调用的，我们也没有源码，怎么处理呢？<\/p>\r\n<p>有什么思路吗？<\/p>","envelopePic":"","fresh":false,"id":9844,"link":"https://www.wanandroid.com/wenda/show/9844","niceDate":"2019-10-23","niceShareDate":"2019-10-20","origin":"","prefix":"","projectLink":"","publishTime":1571760643000,"selfVisible":0,"shareDate":1571586263000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 SDK 的问题 怪我咯？","type":0,"userId":2,"visible":1,"zan":8},{"apkLink":"","audit":1,"author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9939,"link":"https://mp.weixin.qq.com/s/TQ05xCcQjSp9-BFYoQWOqw","niceDate":"2019-10-23","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571760000000,"selfVisible":0,"shareDate":1572008735000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"线程的来龙去脉，你了解吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9924,"link":"https://mp.weixin.qq.com/s/6zLLtY6ooMbujpF3bJFPPw","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572007860000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"基于Jetpack的全系列加实战 app 教程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9928,"link":"https://mp.weixin.qq.com/s/ymuLKtyr_8GCRVsBTylL1Q","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572008040000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android 现在还能执行后台任务吗？试试 WorkManager 吧","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9934,"link":"https://mp.weixin.qq.com/s/07kgEcHXi4MKz2JoEFAg4g","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572008430000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Flutter动画：用Flutter来实现一个拍手动画","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"程序亦非猿","chapterId":428,"chapterName":"程序亦非猿","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9941,"link":"https://mp.weixin.qq.com/s/NwQZ-7NptHb848WYHPljNg","niceDate":"2019-10-22","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,"shareDate":1572008865000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/428/1"}],"title":"成熟项目的Flutter快速引入以及Flutter、Native混合开发探究","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":471,"chapterName":"10.0（Q）","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9857,"link":"https://www.jianshu.com/p/10bdbf883c46?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571671921000,"selfVisible":0,"shareDate":1571665822000,"shareUser":"鸿洋","superChapterId":453,"superChapterName":"版本适配","tags":[],"title":"Android从5.0到9.0版本的主要变更","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9856,"link":"https://juejin.im/post/5dac6aa2518825630e5d17da","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571671919000,"selfVisible":0,"shareDate":1571665646000,"shareUser":"鸿洋","superChapterId":126,"superChapterName":"自定义控件","tags":[],"title":"总结UI原理和UI优化方式","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"jsyjst","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"随心音乐，是一款基于MVP+Retrofit+EventBus+Glide的应用，有兴趣的盆友欢迎Star,Fork!","envelopePic":"https://www.wanandroid.com/blogimgs/025c4573-38d9-4cdc-a591-685a73ac7163.png","fresh":false,"id":9867,"link":"https://www.wanandroid.com/blog/show/2698","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"https://github.com/jsyjst/YuanMusicPlay","publishTime":1571671914000,"selfVisible":0,"shareDate":1571671756000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"随心音乐，让心跟着跳动起来","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9820,"link":"https://www.wanandroid.com/blog/show/2690","niceDate":"2019-10-21","niceShareDate":"2019-10-19","origin":"","prefix":"","projectLink":"","publishTime":1571671906000,"selfVisible":0,"shareDate":1571449264000,"shareUser":"","superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"申请了一波免费票","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"AlanCheen","chapterId":367,"chapterName":"资源聚合类","collect":false,"courseId":13,"desc":"阿里内推指南","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":9866,"link":"https://www.wanandroid.com/blog/show/2697","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"https://github.com/AlanCheen/Alibaba-Nei-Tui-Guide","publishTime":1571671553000,"selfVisible":0,"shareDate":1571671553000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=367"}],"title":"《阿里内推指南》","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"ShowMeThe","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"利用wanandroid ApI实现，基于AAC的玩安卓客户端\r\n网络请求利用Retrofit2 + Coroutines，抛弃了RxJava的怀抱完成网络请求部分\r\n已完成\r\n#主页，公众号，知识体系，项目，收藏，登录注册等基本功能\r\n另外为了实现ROOM的应用，本地添加数据，完成基本的登录和数据展示功能\r\n#剩余功能尚未完善，开发中","envelopePic":"https://www.wanandroid.com/blogimgs/1534e4e3-456e-40dd-8f77-2328ce72a388.png","fresh":false,"id":9863,"link":"https://www.wanandroid.com/blog/show/2694","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"https://github.com/ShowMeThe/WanAndroid","publishTime":1571671303000,"selfVisible":0,"shareDate":1571671303000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于AAC架构玩安卓客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":454,"chapterName":"规范","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9862,"link":"https://w.url.cn/s/AWmdQg1","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571670981000,"selfVisible":0,"shareDate":1571669893000,"shareUser":"ZYLAB","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"五分钟搞定正则表达式，如果没搞定，再加两分钟","type":0,"userId":10577,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9859,"link":"https://juejin.im/post/5dad9f1a6fb9a04e343d672d","niceDate":"2019-10-21","niceShareDate":"2019-10-21","origin":"","prefix":"","projectLink":"","publishTime":1571670946000,"selfVisible":0,"shareDate":1571667421000,"shareUser":"TeaOOf","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"简单大方的状态视图，快了解一下！","type":0,"userId":25956,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9923,"link":"https://mp.weixin.qq.com/s/N3vp91usxclib1NuGEuPgA","niceDate":"2019-10-21","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571587200000,"selfVisible":0,"shareDate":1572007835000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"面试官：今日头条启动很快，你觉得可能是做了哪些优化？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9930,"link":"https://mp.weixin.qq.com/s/9T8yTDaN8z1aeJNuS7pBJw","niceDate":"2019-10-21","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571587200000,"selfVisible":0,"shareDate":1572008132000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"代码写成这样，老夫无可奈何！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9933,"link":"https://mp.weixin.qq.com/s/0xek4nnc2zoKpslEyILQmw","niceDate":"2019-10-21","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1571587200000,"selfVisible":0,"shareDate":1572008412000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"总是听到有人说AndroidX，到底什么是AndroidX？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9823,"link":"https://www.jianshu.com/p/db2b95b92bf0","niceDate":"2019-10-20","niceShareDate":"2019-10-19","origin":"","prefix":"","projectLink":"","publishTime":1571586437000,"selfVisible":0,"shareDate":1571453046000,"shareUser":"于慢慢家的吴蜀黍","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"《Flutter in action》开放下载！闲鱼Flutter企业级实践精选","type":0,"userId":1260,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>作为 Android 开发，这个异常一定都在自家崩溃平台上见过，那么<\/p>\r\n<ol>\r\n<li>有哪些场景下会出现这个异常呢？<\/li>\r\n<li>分别如何解决？<\/li>\r\n<li>有无一些开源方案参考？<\/li>\r\n<\/ol>\r\n<p>知道多少答多少哈，别冷场呀~<\/p>","envelopePic":"","fresh":false,"id":9702,"link":"https://www.wanandroid.com/wenda/show/9702","niceDate":"2019-10-20","niceShareDate":"2019-10-15","origin":"","prefix":"","projectLink":"","publishTime":1571586395000,"selfVisible":0,"shareDate":1571153150000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 BadTokenException 你知道多少？","type":0,"userId":2,"visible":1,"zan":24},{"apkLink":"","audit":1,"author":"xuexiangjys","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"一键集成推送（极光推送、友盟推送、信鸽推送、华为、小米推送等），提供有效的保活机制，支持推送的拓展，充分解耦推送和业务逻辑，解放你的双手！","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":9843,"link":"https://www.wanandroid.com/blog/show/2693","niceDate":"2019-10-20","niceShareDate":"2019-10-20","origin":"","prefix":"","projectLink":"https://github.com/xuexiangjys/XPush","publishTime":1571573517000,"selfVisible":0,"shareDate":1571573517000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"XPush 一个轻量级、可插拔的Android消息推送框架。","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 369
         * size : 20
         * total : 7374
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            @Override
            public String toString() {
                return "DatasBean{" +
                        "apkLink='" + apkLink + '\'' +
                        ", audit=" + audit +
                        ", author='" + author + '\'' +
                        ", chapterId=" + chapterId +
                        ", chapterName='" + chapterName + '\'' +
                        ", collect=" + collect +
                        ", courseId=" + courseId +
                        ", desc='" + desc + '\'' +
                        ", envelopePic='" + envelopePic + '\'' +
                        ", fresh=" + fresh +
                        ", id=" + id +
                        ", link='" + link + '\'' +
                        ", niceDate='" + niceDate + '\'' +
                        ", niceShareDate='" + niceShareDate + '\'' +
                        ", origin='" + origin + '\'' +
                        ", prefix='" + prefix + '\'' +
                        ", projectLink='" + projectLink + '\'' +
                        ", publishTime=" + publishTime +
                        ", selfVisible=" + selfVisible +
                        ", shareDate=" + shareDate +
                        ", shareUser='" + shareUser + '\'' +
                        ", superChapterId=" + superChapterId +
                        ", superChapterName='" + superChapterName + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        ", userId=" + userId +
                        ", visible=" + visible +
                        ", zan=" + zan +
                        ", tags=" + tags +
                        '}';
            }

            /**
             * apkLink :
             * audit : 1
             * author : xiaoyang
             * chapterId : 440
             * chapterName : 官方
             * collect : false
             * courseId : 13
             * desc : <p>上一道题目，关于 BadTokenException，很多同学指出 Toast 可能会出现这个问题，我们需要修复一下。</p>
             <p>我们自己的代码，没问题，可以修复，假设这个 toast 在 SDK里面调用的，我们也没有源码，怎么处理呢？</p>
             <p>有什么思路吗？</p>
             * envelopePic :
             * fresh : false
             * id : 9844
             * link : https://www.wanandroid.com/wenda/show/9844
             * niceDate : 2019-10-23
             * niceShareDate : 2019-10-20
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1571760643000
             * selfVisible : 0
             * shareDate : 1571586263000
             * shareUser :
             * superChapterId : 440
             * superChapterName : 问答
             * tags : [{"name":"问答","url":"/article/list/0?cid=440"}]
             * title : 每日一问 SDK 的问题 怪我咯？
             * type : 0
             * userId : 2
             * visible : 1
             * zan : 8
             */

            private String apkLink;
            private int audit;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 问答
                 * url : /article/list/0?cid=440
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
