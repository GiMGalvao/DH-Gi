function InputComponent({label, type}){ 
    return(
        <>
            <label htmlFor={label}>{label}</label>
            <input type={type} />
        </>

    )

}

export default InputComponent; 