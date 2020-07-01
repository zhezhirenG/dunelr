package core.value.entry;

import io.netty.buffer.ByteBuf;

import java.util.Arrays;

/**
 * @author : gaoxiaodong04
 * @program : dunelr
 * @date : 2020-06-24 15:17
 * @description :
 */
public class DeltaEntry {
    /**
     * 不同的文件块或者是相同文件块在target中的index
     */
    private final byte[] buf;
    /**
     * 文件块是否匹配
     */
    private final boolean bool;

    public DeltaEntry(byte[] buf, boolean bool) {
        this.buf = buf;
        this.bool = bool;
    }

    public byte[] getBuf() {
        return buf;
    }

    public boolean isBool() {
        return bool;
    }

    @Override
    public String toString() {
        return "DeltaFileEntry{" +
                "buf=" + Arrays.toString(buf) +
                ", bool=" + bool +
                '}';
    }
}