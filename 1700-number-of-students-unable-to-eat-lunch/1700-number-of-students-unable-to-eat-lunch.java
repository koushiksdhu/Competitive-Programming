class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stud = new LinkedList<>();
        Queue<Integer> sw = new LinkedList<>();

        for(int i : students)
            stud.add(i);

        for(int i : sandwiches)
            sw.add(i);

        int count = 0;
        while(!stud.isEmpty()) {
            if(stud.peek() == sw.peek()) {
                stud.poll();
                sw.poll();
                count = 0;
            }
            else {
                stud.add(stud.poll());
                count++;
            }
            if(count >= stud.size())
                return stud.size();
        }
        return 0;
    }
}