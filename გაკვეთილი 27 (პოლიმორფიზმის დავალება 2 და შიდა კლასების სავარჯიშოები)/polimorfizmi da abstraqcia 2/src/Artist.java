import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;
    private List<Music> musicList;

    public Artist(String name, List<Album> albums, List<Music> musicList) {
        this.name = name;
        this.albums = albums;
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void addAlbum(Album album) {
        if (albums.contains(album)) {
            return;
        }
        albums.add(album);
        for (Music music : album.getMusicList()) {
            if (musicList.contains(music)) {
                continue;
            }
            musicList.add(music);
        }
    }

    public void removeAlbum(Album album) {
        if (!albums.contains(album)) {
            return;
        }
        albums.remove(album);
        for (Music music : album.getMusicList()) {
            if (!musicList.contains(music)) {
                continue;
            }
            musicList.remove(music);
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Albums:");
        for (Album album : albums) {
            System.out.println(album);
        }
        System.out.println("Music: ");
        for (Music music : musicList) {
            System.out.println(music);
        }
    }
}
