import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SpaceAge {
    private double ageInSeconds;

    private final Map<String, Double> plannetConstants() {

        return Collections.unmodifiableMap(new HashMap<String, Double>() {
            {
                put("earth", 31557977.6137);
                put("mercury", 7600525.8046);
                put("venus", 19411026.17586);
                put("mars", 59359776.7898);
                put("jupiter", 374222565.1452);
                put("saturn", 928792569.65944);
                put("uranus", 2652994591.7355);
                put("neptune", 5196280668.3544);

            }
        });
    }

    public SpaceAge(double ageInSeconds) {

        this.ageInSeconds = ageInSeconds;
    }

    public double getSeconds() {
        return ageInSeconds;
    }

    public double onEarth() {
        return this.ageInSeconds / plannetConstants().get("earth");
    }

    public double onMercury() {
        return this.ageInSeconds / plannetConstants().get("mercury");
    }

    public double onVenus() {
        return this.ageInSeconds / plannetConstants().get("venus");
    }

    public double onMars() {
        return this.ageInSeconds / plannetConstants().get("mars");
    }

    public double onJupiter() {
        return this.ageInSeconds / plannetConstants().get("jupiter");
    }

    public double onSaturn() {
        return this.ageInSeconds / plannetConstants().get("saturn");
    }

    public double onUranus() {
        return this.ageInSeconds / plannetConstants().get("uranus");
    }

    public double onNeptune() {
        return this.ageInSeconds / plannetConstants().get("neptune");
    }
}
