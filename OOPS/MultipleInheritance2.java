class Drive{

	private String name;
	private String type;
	private String fileSystem;
	private double totalCapacity;
	private double usedSpace;
	private double freeSpace;

	Drive(String name, String type, String fileSystem, double totalCapacity, double usedSpace){

		this.name = name;
		this.type = type;
		this.fileSystem = fileSystem;
		this.totalCapacity = totalCapacity;
		this.usedSpace = usedSpace;
		freeSpace = totalCapacity - usedSpace;
	}

	public void getDriveInfo(){
		System.out.println("\n Drive Info");
		System.out.println("Drive Name: "+name);
		System.out.println("Drive Type: "+type);
		System.out.println("File System"+fileSystem);
		System.out.println("Total Capacity: "+totalCapacity);
		System.out.println("Used Space: "+usedSpace);
		System.out.println("Free Space: "+freeSpace);
	}
}

class Folder extends Drive{

	private String folName;
	private String folType;
	private double space;
	private int subFolders;
	private int files;
	private String created;

	Folder(String name, String type, String fileSystem, double totalCapacity, double usedSpace, 
		String folName, String folType, double space, int subFolders, int files, String created)
	{

		super(name, type, fileSystem, totalCapacity, usedSpace);
		this.folName = folName;
		this.folType = folType;
		this.space = space;
		this.subFolders = subFolders;
		this.files = files;
		this.created = created;
	}

	public void getFolderInfo(){
		System.out.println("\n Folder Info");
		System.out.println("Folder Name: "+folName);
		System.out.println("Folder Type: "+folType);
		System.out.println("Space: "+space);
		System.out.println("Sub Foldes: "+subFolders);
		System.out.println("Files: "+files);
		System.out.println("Created Date: "+created);
	}
}

class File extends Folder{

	private String fileName;
	private String fileType;
	private double size;

	File(String name, String type, String fileSystem, double totalCapacity, double usedSpace, 
		String folName, String folType, double space, int subFolders, int files, String created,
		String fileName, String fileType, double size){

		super(name, type, fileSystem, totalCapacity, usedSpace,
			folName, folType, space, subFolders, files, created);
		this.fileName = fileName;
		this.fileType = fileType;
		this.size = size;
	}

	public void getFileInfo(){

		System.out.println("\n--File Info--");
		System.out.println("File Name: "+fileName);
		System.out.println("File Type: "+fileType);
		System.out.println("Size: "+size);
	}
}

class MultipleInheritance2{
	public static void main(String [] args){

		File file = new File("C", "Local Disk", "NTFS", 475, 220, 
							"M65", "File Folder", 348, 45, 384, "14-June-2025",
							"Game", "JAVA file", 1.74);

		file.getFileInfo();
		file.getFolderInfo();
		file.getDriveInfo();
	}
}