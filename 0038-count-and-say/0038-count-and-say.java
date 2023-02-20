class Solution {
    public String countAndSay(int n) {
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(1);
        for (int step = 1; step < n; step++){
            ArrayList<Integer> nextSeq = new ArrayList<>();
            int counter = 1;
            for(int i = 0; i < seq.size()-1; i++){
                if (seq.get(i) == seq.get(i+1)){
                counter++;
                }else {
                nextSeq.add(counter);
                nextSeq.add(seq.get(i));
                counter = 1;
                }
            }
            nextSeq.add(counter);
            nextSeq.add(seq.get(seq.size() - 1));
            seq = nextSeq;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < seq.size(); i++){
            sb.append(seq.get(i));
        }
        return sb.toString();
    }
}
    