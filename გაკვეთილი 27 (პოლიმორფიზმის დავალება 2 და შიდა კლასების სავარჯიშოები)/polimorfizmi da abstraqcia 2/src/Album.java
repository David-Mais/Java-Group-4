import java.util.List;

public class Album {
    private String name;
    private int releaseYear;
    private List<Music> musicList;

    public Album(String name, int releaseYear, List<Music> musicList) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void addMusic(Music music) {
        if (musicList.contains(music)) {
            return;
        }
        musicList.add(music);
    }

    public void removeMusic(Music music) {
        if (!musicList.contains(music)) {
            return;
        }
        musicList.remove(music);
    }

    public void displayInfo() {
        for (Music music : musicList) {
            System.out.println(music);
        }
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", musicList=" + musicList +
                '}';
    }
}
