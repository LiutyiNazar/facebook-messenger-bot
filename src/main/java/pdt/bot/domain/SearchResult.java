package pdt.bot.domain;

public class SearchResult {

    String link;
    String song;
   // String subtitle;
   // String summary;

    public SearchResult(String link, String song, String subtitle, String summary) {
        this.link = link;
        this.song = song;
       /* this.subtitle = subtitle;
        this.summary = summary;*/
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    /*public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }*/
}
