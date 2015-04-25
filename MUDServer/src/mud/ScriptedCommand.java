package mud;

import mud.misc.ProgramInterpreter;
import mud.misc.Script;
import mud.net.Client;

/*
 * Copyright (c) 2015 Jeremy N. Harton
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class ScriptedCommand extends Command {
	private int accessLevel = 0;
	
	private ProgramInterpreter pgmi;
	private Script script;
	
	public ScriptedCommand(MUDServer mParent, String description, ProgramInterpreter pgmi,  Script script) {
		super(mParent, description);
		
		this.pgmi = pgmi;
		this.script = script;
	}
	
	public void execute(String arg, Client client) {
		this.pgmi.interpret(script, getPlayer(client), null);
	}
	
	public void setAcessLevel(int newAccessLevel) {
		this.accessLevel = newAccessLevel;
	}

	public int getAccessLevel() {
		return accessLevel;
	}
}