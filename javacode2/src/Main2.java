public class Main2 {
   public static void main(String args[]) {
     Paragraph para=new Paragraph();
     String str="I am learning Spring and it is interesting";
     para.setContent(str);
     Paper paper=new Paper();
     paper.setPara(para);
     Paragraph paraToRead=paper.getPara();
     String strRead=paraToRead.getContent();
     System.out.println(strRead);
    }
 }