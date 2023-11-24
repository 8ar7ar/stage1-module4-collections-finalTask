package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> developersProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet())
            if (entry.getValue().contains(developer)) developersProjects.add(entry.getKey());

        developersProjects.sort(new ProjectComparator());

        return developersProjects;
    }

    public static class ProjectComparator  implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
           int result =  -(o1.length() - o2.length());
           if (result == 0) return -o1.compareTo(o2);
           return result;
        }
    }
}
