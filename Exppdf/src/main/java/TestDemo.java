import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class TestDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("F://test.pdf"));
            document.open();
            document.add(new Paragraph("yishou ni zhege dashabi"));
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
