package com.syntel.asset;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AssetDetails {

	protected Shell shlSwtApplication;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AssetDetails window = new AssetDetails();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSwtApplication.open();
		shlSwtApplication.layout();
		while (!shlSwtApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSwtApplication = new Shell();
		shlSwtApplication.setSize(818, 550);
		shlSwtApplication.setText("SWT Application");
		shlSwtApplication.setLayout(null);
		
		Label lblProjectName = new Label(shlSwtApplication, SWT.NONE);
		lblProjectName.setBounds(75, 57, 76, 21);
		lblProjectName.setText("project name");
		
		text = new Text(shlSwtApplication, SWT.BORDER);
		text.setBounds(175, 57, 76, 21);
		
		text_1 = new Text(shlSwtApplication, SWT.BORDER);
		text_1.setBounds(536, 57, 76, 21);
		
		Label lblProjectId = new Label(shlSwtApplication, SWT.NONE);
		lblProjectId.setBounds(447, 57, 83, 21);
		lblProjectId.setText("project id");
		
		text_2 = new Text(shlSwtApplication, SWT.BORDER);
		text_2.setBounds(298, 133, 76, 21);
		
		Label lblTicketNumber = new Label(shlSwtApplication, SWT.NONE);
		lblTicketNumber.setBounds(175, 136, 98, 21);
		lblTicketNumber.setText("ticket number");
		
		Button btnNewButton = new Button(shlSwtApplication, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(176, 231, 75, 25);
		btnNewButton.setText("submit");
		
		Button btnClear = new Button(shlSwtApplication, SWT.NONE);
		btnClear.setBounds(404, 231, 75, 25);
		btnClear.setText("clear");

	}
}
