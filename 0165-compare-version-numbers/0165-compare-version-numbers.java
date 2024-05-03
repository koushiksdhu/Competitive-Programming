class Solution {
    public int compareVersion(String version1, String version2) {
        String ver1[] = version1.split("\\.");
        String ver2[] = version2.split("\\.");

        for(int i = 0; i < Math.max(ver1.length, ver2.length); i++) {
            int n1 = i < ver1.length ? Integer.parseInt(ver1[i]) : 0;
            int n2 = i < ver2.length ? Integer.parseInt(ver2[i]) : 0;
            if(n1 < n2)
                return -1;
            else if(n1 > n2)
                return 1;
        }
        return 0;
    }
}