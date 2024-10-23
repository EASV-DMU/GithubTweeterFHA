public class GroupExtraordinaire {
    /**
     * Our tweet
     * @return tweet string
     */
    public String tweet()
    {
        return String.format("%s says this is great!", this.getClass().getName());
    }
}
