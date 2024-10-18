package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트2 {
    public static void main(String[] args) throws Exception {
        Document doc2 =  Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get(); // 체인식 코드
        //찾아볼 태그, 태그.클래스명, 태그.#아이디명, 클래스명, 아이디명
        //<img src = "a.png"> src는 속성

        Elements list = doc2.select("span.code");  //0~여러개
        //<span class = "code">12s3fd</span> : Element, tag

        System.out.println(list.size());//1
        System.out.println(list);
        Element e1 = list.get(0); //<span class = "code">005930</span>
        String code = e1.text();
        System.out.println(code);

        Elements list2 = doc2.select("span.tx");
        System.out.println(list2);
        //여러 개 텍스트 출력

        for (int i = 0; i < list2.size(); i++) {
            Element e2 = list2.get(i);
            System.out.println(e2.text());
        }

        Elements list3 = doc2.select("div.today");
        System.out.println(list3);
        //<div class="today">
        // <p class="no_today"> <em class="no_down"> <span class="blind">59,500</span> <span class="no5">5</span><span class="no9">9</span><span class="shim">,</span><span class="no5">5</span><span class="no0">0</span><span class="no0">0</span> </em> </p>
        // <p class="no_exday"> <span class="sptxt sp_txt1">전일대비</span> <em class="no_down"> <span class="ico down">하락</span> <span class="blind">200</span> <span class="no2">2</span><span class="no0">0</span><span class="no0">0</span> </em> <span class="bar">l</span> <em class="no_down"> <span class="ico minus">-</span> <span class="blind">0.34</span> <span class="no0">0</span><span class="jum">.</span><span class="no3">3</span><span class="no4">4</span> <span class="per">%</span> </em> </p>
        //</div>

        //<span class="blind">59,500</span> --> 이것만 출력하고 싶음
        Elements list4 = doc2.select("div.today span.blind"); //div.today 안에 span.blind 있음 -> 공백으로
        //<span class="blind">59,500</span>
        //<span class="blind">200</span>
        //<span class="blind">0.34</span>
        System.out.println(list4);
        System.out.println(list4.get(0).text());

        Elements list5 = doc2.select("td.first");
        System.out.println(list5);

        Elements list6 = doc2.select("span.blind");
        System.out.println(list6);
        System.out.println(list6.size());

        for (int i = 0; i < list6.size(); i++) {
            System.out.println(i + ":" + list6.get(i));
        }
        //여러 목록을 프린트해서 화면과 비교하면서 몇번 인덱스에 있는지 확인하고 추출
        //고가 high에 넣기
        //현재가 today에 넣기
        //전일 yesterday에 넣기

        //다음과 같이 프린트해보자.
        //회사명 : 삼성전자
        //코드 :
        //고가:
        //현재가 :
        //전일가 :
        System.out.println("회사명 : " + "삼성전자");
        System.out.println("코드 : " + code);
        System.out.println("고가 : " + list6.get(18).text());
        System.out.println("현재가 : " + list6.get(22).text());
        System.out.println("전일가 : " + list6.get(17).text());
    }
}
