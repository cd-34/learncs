public class Song {
    private String name;
    private String artist;
    private int year;

    public Song(String setName, String setArtist, int setYear) {
        assert setName != null && setArtist != null;
        name = setName;
        artist = setArtist;
        year = setYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Song)) {
            return false;
        }
        Song other = (Song) o;
        return other.name.equals(name) && other.artist.equals(artist) && other.year == year;
    }
}