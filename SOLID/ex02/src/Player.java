public class Player {
    private final MediaDecoder decoder;
    private final MediaRenderer renderer;
    private final MediaCache cache;
    private Frame last;

    public Player() {
        this.decoder = new MediaDecoder();
        this.renderer = new MediaRenderer();
        this.cache = new MediaCache();
    }

    void play(byte[] fileBytes) {
        // decode
        Frame f = decoder.decode(fileBytes);
        last = f;
        // draw UI
        renderer.render(fileBytes);
        // cache
        cache.cacheFrame(last);
    }
}