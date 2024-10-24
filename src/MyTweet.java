public class MyTweet {
    /**
     * Our tweet
     * @return tweet string
     */
    public String tweet()
    {
        return String.format("New tweet", this.getClass().getName());
    }
}
