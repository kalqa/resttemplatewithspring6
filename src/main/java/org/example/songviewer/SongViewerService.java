package org.example.songviewer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SongViewerService {

    private final SongFetchable songFetchable;

    SongViewerService(SongFetchable songFetchable) {
        this.songFetchable = songFetchable;
    }

    public List<Song> viewAllSongs() {
        List<Song> songsToView = new ArrayList<>();
        songsToView.addAll(songFetchable.fetchAllSongs());
        return songsToView;
    }
}
