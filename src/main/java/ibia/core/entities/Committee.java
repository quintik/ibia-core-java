package ibia.core.entities;

import ibia.core.utils.Id;

/**
 * Represents a committee within a(n) MUN conference.
 */
public class Committee implements Entity {
    private final EntityType type = EntityType.COM;
    private String id;
    private String name;
    private int size;
    private String conferenceId;

    public Committee() {}

    public Committee(String name, String conferenceId) {
        this.id = Id.generate(type);
        this.name = name;
        this.size = 0;
        this.conferenceId = conferenceId;
    }

    public EntityType getType() {
        return type;
    }

    /** GETTERS and SETTERS used by hibernate */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }
}
