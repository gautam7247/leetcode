class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();

        // Sabhi persons ke index queue me daalo
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        int time = 0;

        while (!q.isEmpty()) {

            int person = q.remove();

            // 1 ticket buy
            tickets[person]--;
            time++;

            // Agar target person ki tickets khatam ho gayi
            if (person == k && tickets[person] == 0) {
                return time;
            }

            // Agar tickets bachi hain to wapas queue me
            if (tickets[person] > 0) {
                q.add(person);
            }
        }

        return time;
    }
}