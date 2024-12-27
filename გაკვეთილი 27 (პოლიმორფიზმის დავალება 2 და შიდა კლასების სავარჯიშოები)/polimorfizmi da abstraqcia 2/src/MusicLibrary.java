import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> musicList;

    public MusicLibrary(List<Artist> artists, List<Album> albums, List<Music> musicList) {
        this.artists = artists;
        this.albums = albums;
        this.musicList = musicList;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
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

    public void addArtist(Artist artist) {
        if (artists.contains(artist)) {
            return;
        }
        artists.add(artist);
        for (Album album : artist.getAlbums()) {
            addAlbum(album);
        }
        for (Music music : artist.getMusicList()) {
            addMusic(music);
        }
    }

    public void removeArtist(Artist artist) {
        if (!artists.contains(artist)) {
            return;
        }
        artists.remove(artist);
        for (Album album : artist.getAlbums()) {
            removeAlbum(album);
        }
        for (Music music : artist.getMusicList()) {
            removeMusic(music);
        }
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

    public Music searchMusic(String title) {
        for (Music music : musicList) {
            if (music.getTitle().equals(title)) {
                return music;
            }
        }
        return null;
    }

    public Music giveRandomMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(musicList.size());
        return musicList.get(randomNumber);
    }
}
