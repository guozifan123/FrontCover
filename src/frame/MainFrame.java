package frame;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import main.Tools;

import java.awt.datatransfer.DataFlavor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;




/**
 * 感谢NetBeans给我生成了海量代码
 * 中文IDE真的好
 * 写注释总有一种这么简单的代码要不要写点什么
 * 据说袋王说要按照全网供稿来计算小偶像的指数
 * #向全世界安利TeamSII#
 * 
 * @author 殷泽凌
 */
public class MainFrame extends javax.swing.JFrame {
	private Clipboard SYSC = Toolkit.getDefaultToolkit().getSystemClipboard();//剪贴板
	private ArrayList<File> fileList=new ArrayList<>();
    private Functionalization fi;//代理接口
	private int count=1;//截图计数
    public MainFrame(Functionalization fi) {
		this.fi=fi;
        initComponents();
		liftList.setSelectedIndex(0);
		setTH();//文件拖拽添加的代码
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
	 * 感谢NetBeans生成的界面，我自己也不知道他说了什么
	 * 就两个列表的的初始化的时候，把参数换了
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liftList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        rightList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        addImgButton = new javax.swing.JButton();
        readImg = new javax.swing.JButton();
        deleteImgButton = new javax.swing.JButton();
        upMoveButton = new javax.swing.JButton();
        downMoveButton = new javax.swing.JButton();
        createCover = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("封面制作器");
        setMinimumSize(new java.awt.Dimension(350, 472));

        liftList.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        liftList.setModel(new javax.swing.AbstractListModel<String>() {
            //这个位置是自己写的
            String[] strings =fi.getFunctionList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        liftList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(liftList);

        rightList.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        rightList.setModel(new javax.swing.AbstractListModel<String>() {
            //这个位置是自己写的
            public int getSize() { return fileList.size(); }
            public String getElementAt(int i) { return fileList.get(i).getName(); }
        });
        rightList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(rightList);

        jPanel1.setLayout(new java.awt.GridLayout(7, 1, 0, 12));

        addImgButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addImgButton.setText("添加图片");
        addImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImgButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addImgButton);

        readImg.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        readImg.setText("读取剪贴板");
        readImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readImgActionPerformed(evt);
            }
        });
        jPanel1.add(readImg);

        deleteImgButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        deleteImgButton.setText("删除图片");
        deleteImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteImgButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteImgButton);

        upMoveButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        upMoveButton.setText("上移");
        upMoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upMoveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(upMoveButton);

        downMoveButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        downMoveButton.setText("下移");
        downMoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMoveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(downMoveButton);

        createCover.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        createCover.setText("生成封面");
        createCover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCoverActionPerformed(evt);
            }
        });
        jPanel1.add(createCover);

        jButton5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton5.setText("下载新功能");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 14, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	//添加图片
    private void addImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImgButtonActionPerformed
        new FileFrame(this).setVisible(true);
		componentsEnabled(false);
    }//GEN-LAST:event_addImgButtonActionPerformed

	//删除图片
    private void deleteImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteImgButtonActionPerformed
        int selectI=rightList.getSelectedIndex();
		if(selectI==-1 || selectI>=fileList.size()){
			return;
		}
		fileList.remove(selectI);
		if(selectI==fileList.size()){
			rightList.setSelectedIndex(selectI-1);
		}
		rightList.updateUI();
    }//GEN-LAST:event_deleteImgButtonActionPerformed

	//上挪
    private void upMoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upMoveButtonActionPerformed
        int selectI=rightList.getSelectedIndex();
		if(selectI<=0){
			return;
		}
		if(fileList.isEmpty()){
			return;
		}
		File temp=fileList.get(selectI);
		fileList.set(selectI, fileList.get(selectI-1));
		fileList.set(selectI-1,temp);
		rightList.setSelectedIndex(selectI-1);
		rightList.updateUI();
    }//GEN-LAST:event_upMoveButtonActionPerformed

	//下挪
    private void downMoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMoveButtonActionPerformed
        int selectI=rightList.getSelectedIndex();
		if(selectI==fileList.size()-1 || selectI==-1){
			return;
		}
		if(fileList.isEmpty()){
			return;
		}
		File temp=fileList.get(selectI);
		fileList.set(selectI, fileList.get(selectI+1));
		fileList.set(selectI+1,temp);
		rightList.setSelectedIndex(selectI+1);
		rightList.updateUI();
    }//GEN-LAST:event_downMoveButtonActionPerformed

	//读取剪贴板
    private void readImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readImgActionPerformed
        try {
			BufferedImage tempBI=(BufferedImage)SYSC.getData(DataFlavor.imageFlavor);
			File tempFile=File.createTempFile("截图"+count+++"号",null);
			ImageIO.write(tempBI, "PNG",tempFile);
			tempFile.deleteOnExit();
			fileList.add(tempFile);
			rightList.updateUI();
		} catch (UnsupportedFlavorException ex) {
			Tools.print("剪切板中的不是图片");
		} catch (IOException ex) {
			Logger.getLogger(FrontCover.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_readImgActionPerformed

	//生成图片
    private void createCoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCoverActionPerformed
		if(liftList.getSelectedIndex()!=-1 && !fileList.isEmpty()){
			new saveFrame(this).setVisible(true);
			componentsEnabled(false);
		}
    }//GEN-LAST:event_createCoverActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText("功能未完成");
    }//GEN-LAST:event_jButton5ActionPerformed

	/**
	 * 设置控件的可用，在弹出选择文件与保存文件之后设置会全部false
	 * 在选择文件窗口关闭之后，会全部true
	 * @param e 
	 */
	void componentsEnabled(Boolean e){
		addImgButton.setEnabled(e);
		deleteImgButton.setEnabled(e);
		createCover.setEnabled(e);
		upMoveButton.setEnabled(e);
		downMoveButton.setEnabled(e);
		liftList.setEnabled(e);
		rightList.setEnabled(e);
		jPanel1.setEnabled(e);
		readImg.setEnabled(e);
		jButton5.setEnabled(e);
	}
	
	/**
	 * 添加图片
	 * @param imgFile 被选择文件窗口调用的函数，用来做传递数据
	 */
	void addImgFile(File[] imgFile){
		fileList.addAll(
				Stream.of(imgFile)
						.filter(predicate->{
								String fileName=predicate.getPath();
								fileName=fileName.substring(fileName.lastIndexOf(".")+1).toUpperCase();
								return "PNG".equals(fileName)||"JPG".equals(fileName);
							})
						.collect(Collectors.toList()));
		rightList.updateUI();
	}
	
	/**
	 * 保存文件
	 * @param savePath 保存路径
	 */
	void setSavePath(String savePath){
		Tools.print(fi.createImg(fileList.toArray(new File[fileList.size()]),liftList.getSelectedValue(),savePath)?"生成成功":"生成失败");
	}
	
	/**
	 * 面向百度编程
	 * 让文件拖拽可实现
	 */
	private void setTH(){
		jPanel2.setTransferHandler(new TransferHandler(){
			private static final long serialVersionUID = 1L;
			@Override
			public boolean importData(JComponent c, Transferable t) {
				try {
					Object o = t.getTransferData(DataFlavor.javaFileListFlavor);
					String temp=o.toString();//文件拖进来的文件的路径
					if (temp.startsWith("[")) {  
                        temp = temp.substring(1);  
                    }  
                    if (temp.endsWith("]")) {  
                        temp = temp.substring(0, temp.length() - 1);  
                    } 
					//文件筛选
					fileList.addAll(Stream.of(temp.split(",\\s"))
							//用逗号加一个空格来实现分割多个文件还是很危险的，但是懒得写更多判断
							.map(mapper->new File(mapper))
							.flatMap(mapper->{
								if(mapper.isDirectory()){
									return Stream.of(mapper.listFiles());//将目录下的图片也加进来
								}else{
									return Stream.of(mapper);	
								}})
							.filter(predicate->{
								String fileName=predicate.getPath();
								fileName=fileName.substring(fileName.lastIndexOf(".")+1).toUpperCase();
								return "PNG".equals(fileName)||"JPG".equals(fileName);
							})
							.collect(Collectors.toList()));
					rightList.updateUI();
					return true;
				} catch (UnsupportedFlavorException ufe) {
					ufe.printStackTrace();
					return true;
				} catch (IOException e) {
					e.printStackTrace();
				}
				return false;
			}
			@Override
			public boolean canImport(JComponent c, DataFlavor[] flavors) {
				return true;
			}
		});
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImgButton;
    private javax.swing.JButton createCover;
    private javax.swing.JButton deleteImgButton;
    private javax.swing.JButton downMoveButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> liftList;
    private javax.swing.JButton readImg;
    private javax.swing.JList<String> rightList;
    private javax.swing.JButton upMoveButton;
    // End of variables declaration//GEN-END:variables
}