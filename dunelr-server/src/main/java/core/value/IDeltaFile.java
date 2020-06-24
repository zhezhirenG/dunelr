package core.value;

/**
 * delta文件抽象，主要记录dune文件间的文件块差异
 * @author gaoxiaodong
 */
public interface IDeltaFile extends Iterable<DeltaFileEntry> {




    /**
     * 合并deltaFile，约定本身为逻辑上版本较后的文件，other以增量形式添加
     * @param other 另一个增量文件
     * @return 新的合并的增量文件
     */
    IDeltaFile plus(IDeltaFile other);

    /**
     * deltaFile的减法，约定本身为逻辑上版本较前的文件，other以增量形式添加
     * @param other 另一个增量文件
     * @return 比较差异，相同的文件差异去除，只留下deltaFile不同的文件块
     */
    IDeltaFile subtract(IDeltaFile other);


}
