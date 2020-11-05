package inputOutput.mainTask;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        getTree(new File(args[0]));
    }

    public static void getTree(File file) {

        File[] tree = file.listFiles();

        if(tree != null) {

            for(int i = 0; i < tree.length; i++) {

                if(tree[i].isDirectory()) {

                    System.out.println("|-----" + tree[i].getName());

                    getTree(tree[i]);

                } else {

                    System.out.println("|     " + tree[i].getName());

                    if(i == tree.length - 1) {

                        System.out.println("|");
                    }
                }
            }
        }
    }
}