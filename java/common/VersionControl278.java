package common;

public class VersionControl278 {
    private int firstBadVersion;

    public VersionControl278(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    protected boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }
}
