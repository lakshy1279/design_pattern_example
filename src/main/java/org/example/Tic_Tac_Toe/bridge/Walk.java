package org.example.Tic_Tac_Toe.bridge;

public class Walk implements MoveLogic{
    @Override
    public void move() {
        System.out.println("Waling Using legs");
    }
}

//another example
// Implementor
interface PlatformAPI {
    void renderVideo(String fileName);
}

// Concrete Implementors
class WindowsAPI implements PlatformAPI {
    public void renderVideo(String fileName) {
        System.out.println("Rendering on Windows: " + fileName);
    }
}
class MacAPI implements PlatformAPI {
    public void renderVideo(String fileName) {
        System.out.println("Rendering on Mac: " + fileName);
    }
}

// Abstraction
abstract class VideoPlayer {
    protected PlatformAPI platform;
    
    public VideoPlayer(PlatformAPI platform) {
        this.platform = platform;
    }
    
    abstract void play(String fileName);
}


// Strategy Interface
interface PlaybackStrategy {
    void execute(String fileName);
}

// Concrete Strategies
class NormalPlayback implements PlaybackStrategy {
    public void execute(String fileName) {
        System.out.println("Playing normally: " + fileName);
    }
}

class FastForwardPlayback implements PlaybackStrategy {
    public void execute(String fileName) {
        System.out.println("Fast forwarding: " + fileName);
    }
}


// Refined Abstraction
class AdvancedVideoPlayer extends VideoPlayer {
    private PlaybackStrategy strategy;

    public AdvancedVideoPlayer(PlatformAPI platform, PlaybackStrategy strategy) {
        super(platform);
        this.strategy = strategy;
    }

    @Override
    void play(String fileName) {
        platform.renderVideo(fileName);    // Bridge part
        strategy.execute(fileName);        // Strategy part
    }
}


public class Client {
    public static void main(String[] args) {
        PlatformAPI platform = new WindowsAPI();
        PlaybackStrategy strategy = new FastForwardPlayback();

        VideoPlayer player = new AdvancedVideoPlayer(platform, strategy);
        player.play("my_movie.mp4");
    }
}


// Use Bridge:

// When you have two orthogonal hierarchies that will evolve independently.
// Example: If you have many types of playback behaviors (Normal, Fast-forward, Slow-mo)
//  AND many types of players (AudioPlayer, VideoPlayer, LiveStreamPlayer), 
//  using a Bridge between Player ↔ PlaybackBehavior makes sense.
