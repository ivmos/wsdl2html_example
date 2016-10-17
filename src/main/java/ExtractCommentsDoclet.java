import com.sun.javadoc.*;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Used to extract comments to txt files which can later be used by wsdl2html
 */
public class ExtractCommentsDoclet {
    public static boolean start(RootDoc root) throws IOException {
        for (ClassDoc c : root.classes()) {
            print(c.qualifiedName(), c.commentText());
            for (FieldDoc f : c.fields(false)) {
                print(f.qualifiedName(), f.commentText());
            }
            for (MethodDoc m : c.methods(false)) {
                print(m.qualifiedName(), m.commentText());
                if (m.commentText() != null && m.commentText().length() > 0) {
                    for (ParamTag p : m.paramTags())
                        print(m.qualifiedName() + "@" + p.parameterName(), p.parameterComment());
                    for (Tag t : m.tags("return")) {
                        if (t.text() != null && t.text().length() > 0)
                            print(m.qualifiedName() + "@return", t.text());
                    }
                }
            }
        }
        return true;
    }

    private static void print(String name, String comment) throws IOException {
        if (comment != null && comment.length() > 0) {
            new FileWriter(name + ".txt").append(comment).close();
        }
    }
}