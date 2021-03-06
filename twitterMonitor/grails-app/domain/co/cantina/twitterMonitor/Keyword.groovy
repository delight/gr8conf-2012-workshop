package co.cantina.twitterMonitor

class Keyword {
    //the text of the actual keyword, and what will be represented to the user
    String text

    //number of parsed messages containing this keyword
    int numSeen = 0
    Long mostRecentTweet = -1

    Date dateCreated
    Date lastUpdated

    static constraints = {
        numSeen min: 0
        text maxSize: 20, unique: true
    }

    public String toString() {
        text
    }
}
