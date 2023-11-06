class SeatManager {

    // BRUTE FORCE: TLE

//     int seats[];
//     public SeatManager(int n) {
//         seats = new int[n+1];
//         Arrays.fill(seats, -1);
//     }
    
//     public int reserve() {
//         int i = 1;
//         for(; i < seats.length; i++){
//             if(seats[i] == -1){
//                 seats[i] = i;
//                 break;
//             }
//         }
//         return i;
//     }
    
//     public void unreserve(int seatNumber) {
//         seats[seatNumber] = -1;
//     }
// }



// OPTIMIZED APPROACH: PRIORITY QUEUE

    PriorityQueue<Integer> seats;
    public SeatManager(int n) {
       seats = new PriorityQueue<>();
       for(int i = 1; i <= n; i++){
           seats.offer(i);
       }
    }
    
    public int reserve() {
       return seats.poll();
    }
    
    public void unreserve(int seatNumber) {
       seats.offer(seatNumber);
    }
}


/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */