import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.lang.annotation.Documented;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        String imgSrc = "images\\erkan.png";
        ImageData data = ImageDataFactory.create(imgSrc);
        Image image1 = new Image(data);
        image1.scaleAbsolute(200, 200);

        String path = "d:\\CV.pdf";


        String text = "ERKAN";
        Paragraph paragraph1 = new Paragraph(text).setBold().setFontSize(25);
        paragraph1.setFixedPosition(300,750,400);


        String text1 = "ALAGOZ";
        Paragraph paragraph2 = new Paragraph(text1).setBold().setFontSize(25);
        paragraph2.setFixedPosition(300,720,400);

        String text2 = "Yazilim Mühendisi";
        Paragraph paragraph3 = new Paragraph(text2).setFontSize(15);
        paragraph3.setFixedPosition(300,690,400);

        String text3 = "IS DENEYIMI";
        Paragraph paragraph4 = new Paragraph(text3).setBold().setFontSize(13).setUnderline();
        paragraph4.setFixedPosition(300,650,400);

        String text4 = "Yazilim Gelistirici";
        Paragraph paragraph5 = new Paragraph(text4).setUnderline();
        paragraph5.setFixedPosition(300,630,400);

        String text5 = "Sesler Sirketi - Istanbul - 2012-2017";
        Paragraph paragraph6 = new Paragraph(text5);
        paragraph6.setFixedPosition(300,610,400);

        String text6 = "Bu sirkette web projeleri üzerinde yazilim gelistirici olarak calistim. Kullanici dostu ve islevsel web uygulamalari gelistirdim, mevcut sistemlerin optimizasyonunu yaptim ve yeni özellikler ekledim.";
        Paragraph paragraph7 = new Paragraph(text6);
        paragraph7.setFixedPosition(300,535,300);

        String text7 = "Yazilim Gelistirici";
        Paragraph paragraph8 = new Paragraph(text7).setUnderline();
        paragraph8.setFixedPosition(300,505,400);

        String text8 = "Babil Oyun Sirketi - Ankara - 2017-2020";
        Paragraph paragraph9 = new Paragraph(text8);
        paragraph9.setFixedPosition(300,485,400);

        String text9 = "Ben, bu sirkette oyun yazilim geliştirici olarak calistim. Oyun tasarimi ve gelistirme süreclerinde aktif rol aldim. C# ve Unity gibi araclari kullanarak cesitli platformlar icin oyunlar gelistirdim. Oyun mekanigi, grafik entegrasyonu ve kullanici arayüzü tasarimi üzerinde calistim.";
        Paragraph paragraph10 = new Paragraph(text9);
        paragraph10.setFixedPosition(300,375,290);

        String text21 = "Yazilim Gelistirici";
        Paragraph paragraph22 = new Paragraph(text21).setUnderline();
        paragraph22.setFixedPosition(300,345,290);

        String text22 = "Dogus Mobil Yazilim Sistemleri - Istanbul - 2020-2024";
        Paragraph paragraph23 = new Paragraph(text22);
        paragraph23.setFixedPosition(300,325,290);

        String text23 = "Web sitesi yazilim calismalarinin gerceklestirilmesi gibi isler yaptım.Ayni zamanda markalarin web sitelerinin güvenlik ve bilisim sistemlerinden sorumluydum.";
        Paragraph paragraph24 = new Paragraph(text23);
        paragraph24.setFixedPosition(300,265,290);


        String text10 = "EGITIM";
        Paragraph paragraph11 = new Paragraph(text10).setBold().setFontSize(13).setUnderline();
        paragraph11.setFixedPosition(300,240,400);

        String text11 = "Istanbul Teknik Universitesi";
        Paragraph paragraph12 = new Paragraph(text11);
        paragraph12.setFixedPosition(300,220,400);

        String tex12 = "Bilgisayar Mühendisligi";
        Paragraph paragraph13 = new Paragraph(tex12);
        paragraph13.setFixedPosition(300,200,400);

        String text13 = "2007 - 2011";
        Paragraph paragraph14 = new Paragraph(text13);
        paragraph14.setFixedPosition(300,180,400);

        String text26 = "SERTIFIKALAR";
        Paragraph paragraph27 = new Paragraph(text26).setBold().setFontSize(13).setUnderline();
        paragraph27.setFixedPosition(300,150,400);

        List liste3 = new List();
        liste3.add("Bilgisayar İsletmenligi Sertifikasi");
        liste3.add("SEO Egitimi Sertifikasi");
        liste3.add("Oracle Certified Professional, Java SE Programmer");
        liste3.add("AWS Certified Solutions Architect");
        liste3.setFixedPosition(300,70,400);

        String text14 = "ILETISIM";
        Paragraph paragraph15 = new Paragraph(text14).setBold().setFontSize(13).setUnderline();
        paragraph15.setFixedPosition(30,560,400);

        String text15 = "Telefon:  05374398877";
        Paragraph paragraph16 = new Paragraph(text15);
        paragraph16.setFixedPosition(30,540,400);

        String text16 = "Email: erkanalagoz@gmail.com";
        Paragraph paragraph17 = new Paragraph(text16);
        paragraph17.setFixedPosition(30,520,400);

        String text24 = " Linkedin: https://www.linkedin.com/in/erkanalagoz/ ";
        Paragraph paragraph25 = new Paragraph(text24);
        paragraph25.setFixedPosition(30,500,400);

        String text25 = " Github: https://github.com/erkanalagoz";
        Paragraph paragraph26 = new Paragraph(text25);
        paragraph26.setFixedPosition(30,480,400);

        String text17 = "HAKKIMDA";
        Paragraph paragraph18 = new Paragraph(text17).setBold().setFontSize(13).setUnderline();
        paragraph18.setFixedPosition(30,455,400);

        String text18 = "Ben, yazilim gelistirici olarak hem oyun hem de web projelerinde deneyim kazandim. Oyun gelistirme sureclerinde, C# ve Unity kullanarak farkli platformlar icin oyunlar gelistirdim, oyun mekanigi ve kullanici arayuzu tasarimi uzerine yogunlastim. Ayni zamanda web projelerinde, kullanici dostu arayuzler ve etkili backend cozumleri olusturmak icin JavaScript ve diger modern teknolojilerle calistim. Ekip calismasina yatkin, problem cozme konusunda hizli ve yaraticiyim. Projeleri zamaninda ve basariyla tamamlama konusunda sorumluluk almaktan keyif aliyorum.";
        Paragraph paragraph19 = new Paragraph(text18);
        paragraph19.setFixedPosition(30,220,250);

        String text19 = "Programlama Dilleri";
        Paragraph paragraph20 = new Paragraph(text19).setBold().setFontSize(13).setUnderline();
        paragraph20.setFixedPosition(30,190,400);

        List liste1 = new List();
        liste1.add("Java");
        liste1.add("C#");
        liste1.add("Nodejs");
        liste1.add("JavaScript");
        liste1.setFixedPosition(30,115,400);

        String text20 = "Diller";
        Paragraph paragraph21 = new Paragraph(text20).setBold().setFontSize(13).setUnderline();
        paragraph21.setFixedPosition(30,90,400);

        List liste2 = new List();
        liste2.add("Ingilizce C1");
        liste2.add("Almanca B2");
        liste2.add("Ispanyolca A2");
        liste2.setFixedPosition(30,35,400);







        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);
        document.add(image1);
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(paragraph3);
        document.add(paragraph4);
        document.add(paragraph5);
        document.add(paragraph6);
        document.add(paragraph7);
        document.add(paragraph8);
        document.add(paragraph9);
        document.add(paragraph10);
        document.add(paragraph22);
        document.add(paragraph23);
        document.add(paragraph24);
        document.add(paragraph11);
        document.add(paragraph12);
        document.add(paragraph13);
        document.add(paragraph14);
        document.add(paragraph27);
        document.add(liste3);
        document.add(paragraph15);
        document.add(paragraph16);
        document.add(paragraph17);
        document.add(paragraph25);
        document.add(paragraph26);
        document.add(paragraph18);
        document.add(paragraph19);
        document.add(paragraph20);
        document.add(liste1);
        document.add(paragraph21);
        document.add(liste2);




        document.close();




        System.out.println("Pdf Oluşturuldu.");
    }
}
