package com.FiveFA_websites;

import com.websites.AnaSinif1;

public class AnaSinif2 {

    public static void main(String[] args) throws RuntimeException, InterruptedException {
        OK_Arena2 arena = new OK_Arena2();
        OK_Bitly2 bitly = new OK_Bitly2();
        OK_Cex2 cex = new OK_Cex2();
        OK_Coinbase2 coinbase = new OK_Coinbase2();
        OK_DropBox2 dropBox = new OK_DropBox2();
        OK_Elastic2 elastic = new OK_Elastic2();
        OK_Expo2 expo = new OK_Expo2();
        OK_Gocardless2 gocardless = new OK_Gocardless2();
        OK_Kaspersky2 kaspersky = new OK_Kaspersky2();
        OK_Monday2 monday = new OK_Monday2();
        OK_PCloud2 pCloud = new OK_PCloud2();
        OK_YouHolder2 youHolder = new OK_YouHolder2();
        OK_Redis2 redis = new OK_Redis2();
        Half_Mongo mongo = new Half_Mongo();
        Half_Gate2 Half_Gate2 = new Half_Gate2();
        OK_Unity unity = new OK_Unity();


        for (int i = 0; i < 5; i++) {

            redis.redis();
            AnaSinif2.sleep(1);

            dropBox.dropbox();
            AnaSinif2.sleep(1);

            youHolder.youholder();
            AnaSinif2.sleep(1);

            kaspersky.kaspersky();
            AnaSinif2.sleep(1);

            monday.monday();
            AnaSinif2.sleep(1);

            pCloud.pcloud();
            AnaSinif2.sleep(1);

            elastic.elastic();
            AnaSinif2.sleep(1);

            cex.cex();
            AnaSinif2.sleep(1);

            bitly.bitly();
            AnaSinif2.sleep(1);

            arena.arena();
            AnaSinif2.sleep(1);

            expo.expo();
            AnaSinif2.sleep(1);

            gocardless.gocardless();
            AnaSinif2.sleep(1);

            unity.unity();
            AnaSinif2.sleep(1);


        }

        for (int i = 0; i < 2; i++) {
            try {
                new AnaSinif1().anaSinif1();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        coinbase.coinbase();//sık sık hata veriyor.yavaş site
        Half_Gate2.gate();//captcha var yarım çalışıyor
        mongo.mongo();//send e basmıyor


    }

    public static void sleep(long seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
