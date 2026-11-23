package byteflix.models;

public class Serie {
    private int seasons;
    private boolean active;
    private int seasonEpisodes;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeasonEpisodes() {
        return seasonEpisodes;
    }

    public void setSeasonEpisodes(int seasonEpisodes) {
        this.seasonEpisodes = seasonEpisodes;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
