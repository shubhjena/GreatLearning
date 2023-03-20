package Week12_Stacks_and_Queues;

import java.util.*;

public class SimplifyPath{
    public static String simplifyPath(String path) {
        Deque<String> canPath = new ArrayDeque<>();
        String[] dirArr = path.split("/");
        for(String dir : dirArr){
            if (dir.equals("..")){
                if(!canPath.isEmpty())
                    canPath.removeLast();
            }
            else if (!(dir.equals(".") || dir.equals("")) )
               canPath.addLast(dir);
        }
        StringBuilder canonicalPath = new StringBuilder();
        while(!canPath.isEmpty()) {
            canonicalPath.append("/");
            canonicalPath.append(canPath.removeFirst());
        }

        if (canonicalPath.isEmpty())
            return "/";
        return  canonicalPath.toString();
    }

    public static void main(String[] args) {
        String path = "/home//foo/";
        String simplePath = SimplifyPath.simplifyPath(path);
        System.out.println("Canonical Path: "+ simplePath);

    }
}